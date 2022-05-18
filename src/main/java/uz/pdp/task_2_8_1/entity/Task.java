package uz.pdp.task_2_8_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task_2_8_1.entity.template.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends BaseEntity {
    private String name;

    private String description;

    @ManyToOne
    private Status statusId;

    @ManyToOne
    private Category categoryId;

    @ManyToOne
    private Priority priorityId;

    @OneToMany
    private Set<Task> parentTaskId;

    private Date startedDate;

    private Date startTimeHas;
    private Date DueDate;
    private Date DueTimeHas;
    private Long estimateTime;
    private Date activateDate;
}
