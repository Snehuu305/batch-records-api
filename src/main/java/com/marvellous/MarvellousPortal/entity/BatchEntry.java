package com.marvellous.MarvellousPortal.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    @Id
    private String id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Positive(message = "Fees must be greater than zero")
    private int fees;
}
