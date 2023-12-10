package org.tms.ht.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.ht.UserRole;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto {

    private String upName;

    private UserRole upRole;

    private Date upBirthday;

    private boolean isMan;

}
