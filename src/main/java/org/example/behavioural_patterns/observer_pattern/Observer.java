package org.example.behavioural_patterns.observer_pattern;

import org.example.behavioural_patterns.observer_pattern.domain.Employee;

public interface Observer {
    void update(Employee employee, String message);
}
