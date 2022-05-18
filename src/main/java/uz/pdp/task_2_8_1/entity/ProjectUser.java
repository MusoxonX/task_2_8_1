package uz.pdp.task_2_8_1.entity;

import lombok.*;
import uz.pdp.task_2_8_1.entity.enums.TaskPermission;
import uz.pdp.task_2_8_1.entity.template.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectUser extends BaseEntity {
    private String name;

    @OneToOne
    private Project projectId;

    @OneToMany
    private Set<User> userId;

    @ElementCollection
    private List<TaskPermission> taskPermission;
}
