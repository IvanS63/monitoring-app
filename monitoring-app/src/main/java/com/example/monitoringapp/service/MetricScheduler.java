package com.example.monitoringapp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MetricScheduler {

    private final MetricProvider metricProvider;

    public MetricScheduler(MetricProvider metricProvider) {
        this.metricProvider = metricProvider;
    }

    @Scheduled(fixedRate = 1000)
    public void triggerCustomMetrics() {
        metricProvider.getRandomMetricsData();
    }
}