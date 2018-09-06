package com.k3i.zsgl.mongo;

import java.util.List;

public interface TimeaxisNodeService {
    public List<TimeaxisNode> findAll();
    public String insert(TimeaxisNode node);
    public void update(TimeaxisNode node);
}
