package pl.microblog.dao;

import java.util.List;

import pl.microblog.model.Wpis;

public interface WpisDao {

    List<Wpis> getUserTimeline(Integer userId);

    List<Wpis> getFullTimeline(Integer userId);

    List<Wpis> getPublicTimeline();

    void save(Wpis wpis);
}
