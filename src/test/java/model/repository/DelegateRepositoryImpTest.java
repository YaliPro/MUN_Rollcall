package model.repository;

import model.objects.Delegate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quentin on 9/6/16.
 */
public class DelegateRepositoryImpTest {

    Delegate Tom = new Delegate("Tom", "ss", 12, 23, 23, 23);
    Delegate Jean = new Delegate("Jean", "ww", 12, 32, 421, 5);
    List<Delegate> delegates;

    DelegateRepository repositoryImp;

    @Before
    public void setup() {
        delegates = new ArrayList<>();
        delegates.add(Tom);
        delegates.add(Jean);

        repositoryImp = new DelegateRepositoryImp();
    }

    @Test
    public void updateDelegates() throws Exception {
        repositoryImp.updateDelegates(delegates);
    }

    @Test
    public void getDelegates() {
        List<Delegate> list = repositoryImp.getDelegates();
        Assert.assertNotEquals(0, list.size());
        Assert.assertEquals(Tom.toString(), list.get(0).toString());
        Assert.assertEquals(Jean.toString(), list.get(1).toString());
    }

}