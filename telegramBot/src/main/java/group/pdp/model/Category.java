package group.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    private UUID id;
    private UUID customerId;
    private UUID parentId;
    private String path;
    private String name;
}
