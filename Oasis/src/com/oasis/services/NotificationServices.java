package com.oasis.services;

import com.oasis.controller.main.DashboardController;
import com.oasis.factory.UIFactory;
import com.oasis.ui.UIName;
import com.oasis.ui.component.Notification;

public class NotificationServices {
    public static void addNotification(Notification notification) {
        DashboardController dashboardController = (DashboardController) UIFactory.getUI(UIName.DASHBOARD).getController();
        dashboardController.getNotificationFXC().addNotification(notification);
    }

    public static void removeNotification(Notification notification) {
        DashboardController dashboardController = (DashboardController) UIFactory.getUI(UIName.DASHBOARD).getController();
        dashboardController.getNotificationFXC().removeNotification(notification);
    }
}
