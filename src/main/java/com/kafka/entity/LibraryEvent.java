package com.kafka.entity;

import com.kafka.constant.LibraryEventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Praveen Yadav
 * @since 13-Jun-2021, 5:06 PM
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LibraryEvent {

    @Id
    @GeneratedValue
    private Integer libraryEventId;
    @Enumerated(EnumType.STRING)
    private LibraryEventType libraryEventType;
    @OneToOne(mappedBy = "libraryEvent", cascade = {CascadeType.ALL})
    //Exclude Book from ToString method to avoid looping since Book also contain libraryEvent mapping
    @ToString.Exclude
    private Book book;

}
