package com.example.applicationLecture.registrationForm.service.implement;

import com.example.applicationLecture.registrationForm.dto.FormDto;
import com.example.applicationLecture.registrationForm.entity.Form;
import com.example.applicationLecture.registrationForm.repository.FormRepository;
import com.example.applicationLecture.registrationForm.service.FormService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class FormImpl implements FormService {
    @Autowired
    private FormRepository formRepository;
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public ResponseEntity<?> saveForm(FormDto formDto) {
        Form forms = new Form();
        forms.setFirstName(formDto.getFirstName());
        forms.setLastName(formDto.getLastName());
        forms.setEmail(formDto.getEmail());
        forms.setPassword(formDto.getPassword());
        forms.setConfirmPassword(formDto.getConfirmPassword());
        forms.setPhoneNo(formDto.getPhoneNo());
        forms.setAddress(formDto.getAddress());
        forms.setCity(formDto.getCity());
        forms.setState(formDto.getState());
        forms.setZipCode(formDto.getZipCode());
        formRepository.save(forms);
        sendEmail(formDto);
        return ResponseEntity.ok().body("Form Saved Successfully");
    }

    @Override
    public void sendEmail(FormDto formDto) {
        String to = formDto.getEmail();
        String subject = "Form Submission Confirmation";
        String body = String.format("Dear %s %s,\n\nYour form has been successfully submitted. Here are the details:\n\n" +
                "First Name: %s\nLast Name: %s\nEmail: %s\nPhone No: %d\nAddress: %s\nCity: %s\nState: %s\nZip Code: %d\n\nThank you.",
                formDto.getFirstName(), formDto.getLastName(), formDto.getFirstName(), formDto.getLastName(), formDto.getEmail(),
                formDto.getPhoneNo(), formDto.getAddress(), formDto.getCity(), formDto.getState(), formDto.getZipCode());
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setFrom("vibez2703@gmail.com");
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);
            javaMailSender.send(mimeMessage);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
