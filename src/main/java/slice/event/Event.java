package slice.event;

import lombok.Getter;
import lombok.Setter;

/**
 * Everything in this class is done by the Client
 *
 * @author Nick
 * @since 1/2/2023
 * */
@Getter @Setter
public class Event {
    public boolean cancelled;
    public void call(){}
}
