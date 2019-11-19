package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.MinSecurityDepositConfig;
import com.digi.crm.model.NotificationTemplate;

@Repository
public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplate, Long> {

	NotificationTemplate findNotificationTemplateByTemplateNameAndTemplateTypeAndModeOfDeliveryAndTemplateLanguageAndSourceAndBuId(
			String templateName, String templateType, String modeOfDelivery, String templateLanguage, String source,
			String buId);

	NotificationTemplate findNotificationTemplateListByBuIdAndCreatedByAndSourceAndTemplateNameAndTemplateLanguageAndTemplateTypeAndModeOfDeliveryAndStatus(
			String buId, String userId, String module, String notificationName, String language,
			String notificationType, String deliveryMode, String statusActive);

	/*List<NotificationTemplate> findNotificationTemplateListByBuIdAndCreatedByAndSourceAndTemplateNameAndTemplateLanguageAndTemplateTypeAndModeOfDeliveryAndStatus(
			String buId, String userId, String module, String notificationName, String language,
			String notificationType, String deliveryMode, String statusActive);*/


}
 