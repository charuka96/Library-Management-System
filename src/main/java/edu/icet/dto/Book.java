package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    private Integer bookId;
    private Double price;
    private String title;
    private String isbn;
    private String category;
    private Integer authorId;
}
