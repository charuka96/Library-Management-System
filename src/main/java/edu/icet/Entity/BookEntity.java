package edu.icet.Entity;

import edu.icet.dto.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.awt.geom.Rectangle2D;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name ="Book")

public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private Double price;
    private String title;
    private String isbn;
    private String category;
    private Integer authorId;
}
