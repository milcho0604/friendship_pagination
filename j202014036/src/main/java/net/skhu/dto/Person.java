package net.skhu.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Person {
    int pid;

    @NotNull
    @Min(1)
    @Max(3)
    int title;

    @NotEmpty
    @NotBlank
    String name;

    @NotNull
    int categoryCode;

    String phone;
    String gender;

    @Email
    String email;

    String titleName;
}
