import java.io.IOException;
import java.io.Writer;

public interface Writeable {

    public void writeTo(Writer destination) throws IOException;

}
