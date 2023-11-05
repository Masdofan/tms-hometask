package org.tms.ht.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.ht.TaskStatus;
import org.tms.ht.entity.UserEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskSearchDto {

    private TaskStatus status;

    private UserEntity user;

}
