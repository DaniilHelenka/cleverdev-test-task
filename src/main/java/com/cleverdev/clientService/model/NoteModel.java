package com.cleverdev.clientService.model;

import lombok.Data;
import org.springframework.stereotype.Component;



@Component
@Data
public class NoteModel {
    private String note;
    private String userLogin;
    private String patientGuid;
}
