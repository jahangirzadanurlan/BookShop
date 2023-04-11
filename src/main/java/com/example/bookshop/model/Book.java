package com.example.bookshop.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Book {
    Long id;
    String bookName;
    String bookEdition;
    Float bookPrice;
}
