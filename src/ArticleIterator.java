import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator{
    private List<ArticleComponent> components = new ArrayList<>();
    private int i = 0;

    public ArticleIterator(List<ArticleComponent> component1) {
        components = component1;
    }
    public boolean hasNext() {
        return i < components.size()-1;
    }

    public ArticleComponent next() {
        return components.get(++i);
    }
    
}
