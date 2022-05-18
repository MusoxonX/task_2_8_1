package uz.pdp.task_2_8_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task_2_8_1.entity.template.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tag extends BaseEntity {
    private String name;
    private String color;
    @ManyToOne
    private Workspace workspaceId;
}
