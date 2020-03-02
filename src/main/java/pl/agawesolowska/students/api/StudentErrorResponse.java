package pl.agawesolowska.students.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Simple error response class.
 * 
 * @author Aga
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class StudentErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;

}
