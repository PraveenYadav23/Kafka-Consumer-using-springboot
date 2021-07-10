package com.kafka.dao;

import com.kafka.entity.LibraryEvent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Praveen Yadav
 * @since 13-Jun-2021, 5:23 PM
 */
public interface LibraryEventDao extends JpaRepository<LibraryEvent, Integer> {
}
