package transaction;

import lombok.Data;

/*
롬복 라이브러리를 통해 getter/setter를 자동으로 생성
 */
@Data
public class TicketDTO {
	private String customerId;
	private int amount;
}
