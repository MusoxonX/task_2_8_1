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
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends BaseEntity {
    private String name;
    private String color;

    @ManyToOne
    private Workspace workspaceId;

    private String initialLetter;

    @OneToOne
    private Icon iconId;

    @OneToMany
    private List<Attachment> avatarId;

    @ManyToOne
    private User ownerId;

    private String accessType;
}
