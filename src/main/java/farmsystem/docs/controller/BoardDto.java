package farmsystem.docs.controller;

import farmsystem.docs.domain.BoardEntity;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
