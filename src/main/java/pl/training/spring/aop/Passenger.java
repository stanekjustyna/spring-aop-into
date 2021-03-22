package pl.training.spring.aop;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Passenger {

    @NonNull
    private Long id;

}
