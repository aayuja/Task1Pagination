package com.task1.painationExample.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("User")
public class User {

	@Id
	String id;
	int user_id;
	String username;
	String first_name;
	String last_name;
	String password;
	int status;
}
