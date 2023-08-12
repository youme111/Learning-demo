package com.example.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        List<List<Session>> continuousSubsequences = main.getContinuousSubsequences(new ArrayList<>());

        for (List<Session> subsequence : continuousSubsequences) {
            System.out.println(subsequence);
        }
    }

    public List<List<Session>> getContinuousSubsequences(List<Session> sessions) {
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 9, 0), LocalDateTime.of(2023, 8, 1, 10, 0)));
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 10, 0), LocalDateTime.of(2023, 8, 1, 11, 0)));
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 11, 0), LocalDateTime.of(2023, 8, 1, 12, 0)));
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 13, 0), LocalDateTime.of(2023, 8, 1, 14, 0)));
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 14, 0), LocalDateTime.of(2023, 8, 1, 15, 0)));
        sessions.add(new Session(LocalDateTime.of(2023, 8, 1, 15, 0), LocalDateTime.of(2023, 8, 1, 16, 30)));

        List<List<Session>> result = new ArrayList<>();
        List<Session> currentSubsequence = new ArrayList<>();

        for (int i = 0; i < sessions.size(); i++) {
            if (currentSubsequence.isEmpty() || sessions.get(i).getStartTime().isEqual(currentSubsequence.get(currentSubsequence.size() - 1).getEndTime())) {
                currentSubsequence.add(sessions.get(i));
            } else {
                result.add(new ArrayList<>(currentSubsequence));
                currentSubsequence.clear();
                currentSubsequence.add(sessions.get(i));
            }
        }

        if (!currentSubsequence.isEmpty()) {
            result.add(currentSubsequence);
        }

        return result;
    }

    @AllArgsConstructor
    @Data
    class Session {
        private LocalDateTime startTime;
        private LocalDateTime endTime;

        // 构造函数、getter和setter等
    }
}
