package uz.pdp.task_2_8_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task_2_8_1.entity.enums.TaskPermission;
import uz.pdp.task_2_8_1.entity.template.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskAttachment extends BaseEntity {
    private String name;

    @OneToOne
    private Task taskId;

    @OneToMany
    private Set<Attachment> attachmentsId;

    private boolean pinCoverImage;
}
