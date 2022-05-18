package uz.pdp.task_2_8_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task_2_8_1.entity.enums.Permission;
import uz.pdp.task_2_8_1.entity.template.BaseEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends BaseEntity {
    private String name;
    @ManyToOne
    private WorkspaceRole workspaceRoleId;

    @ElementCollection
    private List<Permission> permission;
}
