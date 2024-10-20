package com.facebook.messaging.model.messages;

import X.0fH;
import X.1BJ;
import X.1BK;
import X.4YT;
import X.AbG;
import X.AnonymousClass001;
import X.DJg;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GenericAdminMessageExtensibleData.class */
public abstract class GenericAdminMessageExtensibleData implements Parcelable {
    public static ImmutableMap A00;

    public static DJg A07(String str) {
        ImmutableMap immutableMap = A00;
        if (immutableMap == null) {
            ImmutableMap.Builder A0c = 1BK.A0c();
            A0c.put(1BJ.A00(ActionId.MQTT_CONNECTED), InstantGameInfoProperties.CREATOR);
            A0c.put("GROUP_POLL", GroupPollingInfoProperties.CREATOR);
            A0c.put(4YT.A00(672), MediaSubscriptionManageInfoProperties.CREATOR);
            A0c.put("MESSENGER_EXTENSION_ADD_CART", MessengerCartInfoProperties.CREATOR);
            A0c.put(4YT.A00(680), MessengerCallToActionProperties.CREATOR);
            A0c.put(4YT.A00(28), GroupPaymentInfoProperties.CREATOR);
            A0c.put(4YT.A00(29), P2pPaymentRequestReminderProperties.CREATOR);
            A0c.put("MESSENGER_CALL_LOG", MessengerCallLogProperties.CREATOR);
            A0c.put("PAGES_MARK_AS_PAID", MessengerPagesMarkPaidProperties.CREATOR);
            A0c.put(4YT.A00(96), GrowthGenericAdminMessageProperties.CREATOR);
            A0c.put("LINK_CTA", LinkCTAAdminTextProperties.CREATOR);
            A0c.put("CONFIRM_FRIEND_REQUEST", ConfirmFriendRequestInfoProperties.CREATOR);
            A0c.put("NEO_APPROVED_CONNECTION_ADDED", ParentApprovedUserAddedAdminTextProperties.CREATOR);
            A0c.put(4YT.A00(48), MentorshipProgramLeavePromptProperties.CREATOR);
            A0c.put("PAGES_MARK_AS_PAID_NEW", MessengerNewPagesMarkAsPaidProperties.CREATOR);
            A0c.put(4YT.A00(49), MessengerPageThreadActionSystemAddDetailsProperty.CREATOR);
            A0c.put(4YT.A00(100), PaymentsSupportCaseProperties.CREATOR);
            A0c.put(4YT.A00(98), P2BPrivacyDisclosureAdminTextProperties.CREATOR);
            A0c.put(4YT.A00(95), MessengerFAQResponseResolutionSignalCollectionXMATProperties.CREATOR);
            A0c.put(4YT.A00(ActionId.ON_VIEW_CREATED_END), ServiceBookingLegalDisclaimerXMATProperties.CREATOR);
            A0c.put(4YT.A00(90), P2BSellerReviewPostSubmissionAdminTextProperties.CREATOR);
            A0c.put("MESSAGING_OFFERS_REMINDER", MessagingOffersReminderAdminTextProperties.CREATOR);
            A0c.put(4YT.A00(89), DetectedOutcomeAdminMessageProperties.CREATOR);
            immutableMap = AbG.A10(A0c, 4YT.A00(97), LeadFormsOptOutAdminMessageProperties.CREATOR);
            A00 = immutableMap;
        }
        return (DJg) immutableMap.get(str);
    }

    public String A08() {
        int i;
        if (this instanceof ServiceBookingLegalDisclaimerXMATProperties) {
            i = 101;
        } else if (this instanceof PaymentsSupportCaseProperties) {
            i = 100;
        } else {
            if (this instanceof ParentApprovedUserAddedAdminTextProperties) {
                return "NEO_APPROVED_CONNECTION_ADDED";
            }
            if (this instanceof P2pPaymentRequestReminderProperties) {
                i = 29;
            } else if (this instanceof P2BSellerReviewPostSubmissionAdminTextProperties) {
                i = 90;
            } else if (this instanceof P2BPrivacyDisclosureAdminTextProperties) {
                i = 98;
            } else {
                if (this instanceof MessengerPagesMarkPaidProperties) {
                    return "PAGES_MARK_AS_PAID";
                }
                if (this instanceof MessengerPageThreadActionSystemAddDetailsProperty) {
                    i = 49;
                } else {
                    if (this instanceof MessengerNewPagesMarkAsPaidProperties) {
                        return "PAGES_MARK_AS_PAID_NEW";
                    }
                    if (this instanceof MessengerFAQResponseResolutionSignalCollectionXMATProperties) {
                        i = 95;
                    } else {
                        if (this instanceof MessengerCallLogProperties) {
                            return "MESSENGER_CALL_LOG";
                        }
                        if (this instanceof MessagingOffersReminderAdminTextProperties) {
                            return "MESSAGING_OFFERS_REMINDER";
                        }
                        if (this instanceof MentorshipProgramLeavePromptProperties) {
                            i = 48;
                        } else {
                            if (this instanceof LinkCTAAdminTextProperties) {
                                return "LINK_CTA";
                            }
                            i = this instanceof LeadFormsOptOutAdminMessageProperties ? 97 : 89;
                        }
                    }
                }
            }
        }
        return 4YT.A00(i);
    }

    public JSONObject A09() {
        JSONObject A12;
        Class cls;
        String str;
        String str2;
        if (!(this instanceof ServiceBookingLegalDisclaimerXMATProperties)) {
            if (this instanceof PaymentsSupportCaseProperties) {
                PaymentsSupportCaseProperties paymentsSupportCaseProperties = (PaymentsSupportCaseProperties) this;
                A12 = AnonymousClass001.A12();
                try {
                    A12.put("is_enabled", paymentsSupportCaseProperties.A04);
                    A12.put("order_id", paymentsSupportCaseProperties.A01);
                    A12.put("order_item_id", paymentsSupportCaseProperties.A02);
                    A12.put("text", paymentsSupportCaseProperties.A03);
                    A12.put("link_text", paymentsSupportCaseProperties.A00);
                    return A12;
                } catch (JSONException e) {
                    e = e;
                    str2 = "PaymentsSupportCaseProperties";
                }
            } else {
                if (this instanceof ParentApprovedUserAddedAdminTextProperties) {
                    ParentApprovedUserAddedAdminTextProperties parentApprovedUserAddedAdminTextProperties = (ParentApprovedUserAddedAdminTextProperties) this;
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put("is_wave_enabled", parentApprovedUserAddedAdminTextProperties.A00);
                    return A122;
                }
                if (this instanceof P2pPaymentRequestReminderProperties) {
                    P2pPaymentRequestReminderProperties p2pPaymentRequestReminderProperties = (P2pPaymentRequestReminderProperties) this;
                    JSONObject A123 = AnonymousClass001.A12();
                    A123.put("request_fbid", p2pPaymentRequestReminderProperties.A00);
                    return A123;
                }
                if (this instanceof P2BSellerReviewPostSubmissionAdminTextProperties) {
                    P2BSellerReviewPostSubmissionAdminTextProperties p2BSellerReviewPostSubmissionAdminTextProperties = (P2BSellerReviewPostSubmissionAdminTextProperties) this;
                    A12 = AnonymousClass001.A12();
                    try {
                        A12.put("order_id", p2BSellerReviewPostSubmissionAdminTextProperties.A01);
                        A12.put("seller_review_xmat_edit_cta_text", p2BSellerReviewPostSubmissionAdminTextProperties.A00);
                        return A12;
                    } catch (JSONException e2) {
                        e = e2;
                        cls = P2BSellerReviewPostSubmissionAdminTextProperties.class;
                        str = "Failed to serialize P2BSellerReviewPostSubmissionAdminTextProperties to Json";
                    }
                } else if (this instanceof P2BPrivacyDisclosureAdminTextProperties) {
                    P2BPrivacyDisclosureAdminTextProperties p2BPrivacyDisclosureAdminTextProperties = (P2BPrivacyDisclosureAdminTextProperties) this;
                    A12 = AnonymousClass001.A12();
                    try {
                        A12.put("p2b_privacy_disclosure_xmat_cta_text", p2BPrivacyDisclosureAdminTextProperties.A00);
                        return A12;
                    } catch (JSONException e3) {
                        e = e3;
                        cls = P2BPrivacyDisclosureAdminTextProperties.class;
                        str = "Failed to serialize P2BPrivacyDisclosureAdminTextProperties to Json";
                    }
                } else {
                    if (this instanceof MessengerPagesMarkPaidProperties) {
                        MessengerPagesMarkPaidProperties messengerPagesMarkPaidProperties = (MessengerPagesMarkPaidProperties) this;
                        JSONObject A124 = AnonymousClass001.A12();
                        A124.put("currency_code", messengerPagesMarkPaidProperties.A00);
                        return A124;
                    }
                    if (this instanceof MessengerPageThreadActionSystemAddDetailsProperty) {
                        MessengerPageThreadActionSystemAddDetailsProperty messengerPageThreadActionSystemAddDetailsProperty = (MessengerPageThreadActionSystemAddDetailsProperty) this;
                        A12 = AnonymousClass001.A12();
                        try {
                            String str3 = messengerPageThreadActionSystemAddDetailsProperty.A01;
                            if (str3 != null) {
                                A12.put("interaction_type", str3);
                                A12.put("interaction_id", messengerPageThreadActionSystemAddDetailsProperty.A00);
                                return A12;
                            }
                            return A12;
                        } catch (JSONException e4) {
                            e = e4;
                            str2 = "MessengerPageThreadActionSystemAddDetailsProperty";
                        }
                    } else if (this instanceof MessengerNewPagesMarkAsPaidProperties) {
                        MessengerNewPagesMarkAsPaidProperties messengerNewPagesMarkAsPaidProperties = (MessengerNewPagesMarkAsPaidProperties) this;
                        A12 = AnonymousClass001.A12();
                        try {
                            String str4 = messengerNewPagesMarkAsPaidProperties.A01;
                            if (str4 != null) {
                                A12.put("currency_code", str4);
                            }
                            String str5 = messengerNewPagesMarkAsPaidProperties.A02;
                            if (str5 != null) {
                                A12.put("detection_type", str5);
                            }
                            A12.put("cta_text", messengerNewPagesMarkAsPaidProperties.A00);
                            return A12;
                        } catch (JSONException e5) {
                            e = e5;
                            str2 = "MessengerNewPagesMarkAsPaidProperties";
                        }
                    } else if (this instanceof MessengerFAQResponseResolutionSignalCollectionXMATProperties) {
                        MessengerFAQResponseResolutionSignalCollectionXMATProperties messengerFAQResponseResolutionSignalCollectionXMATProperties = (MessengerFAQResponseResolutionSignalCollectionXMATProperties) this;
                        A12 = AnonymousClass001.A12();
                        try {
                            A12.put("positive_cta_text", messengerFAQResponseResolutionSignalCollectionXMATProperties.A00);
                            return A12;
                        } catch (JSONException e6) {
                            e = e6;
                            cls = MessengerFAQResponseResolutionSignalCollectionXMATProperties.class;
                            str = "Failed to serialize MessengerFAQResponseResolutionSignalCollectionXMATProperties to Json";
                        }
                    } else {
                        if (this instanceof MessengerCallLogProperties) {
                            MessengerCallLogProperties messengerCallLogProperties = (MessengerCallLogProperties) this;
                            JSONObject A125 = AnonymousClass001.A12();
                            A125.put("event", messengerCallLogProperties.A07);
                            String str6 = messengerCallLogProperties.A04;
                            A125.put("caller_id", str6);
                            A125.put("callee_id", str6);
                            A125.put("conference_name", messengerCallLogProperties.A06);
                            A125.put("server_info", messengerCallLogProperties.A08);
                            A125.put("video", messengerCallLogProperties.A09);
                            A125.put("call_duration", messengerCallLogProperties.A00);
                            A125.put("call_capture_attachments", MessengerCallLogProperties.A04(messengerCallLogProperties.A01));
                            A125.put("participant_app_ids_json", MessengerCallLogProperties.A06(messengerCallLogProperties.A03));
                            A125.put("missed_call_participant_ids", MessengerCallLogProperties.A05(messengerCallLogProperties.A02));
                            return A125;
                        }
                        if (this instanceof MessagingOffersReminderAdminTextProperties) {
                            MessagingOffersReminderAdminTextProperties messagingOffersReminderAdminTextProperties = (MessagingOffersReminderAdminTextProperties) this;
                            A12 = AnonymousClass001.A12();
                            try {
                                A12.put("offer_id", messagingOffersReminderAdminTextProperties.A01);
                                A12.put("cta_text", messagingOffersReminderAdminTextProperties.A00);
                                return A12;
                            } catch (JSONException e7) {
                                e = e7;
                                cls = MessagingOffersReminderAdminTextProperties.class;
                                str = "Failed to serialize MessagingOffersReminderAdminTextProperties to Json";
                            }
                        } else if (this instanceof MentorshipProgramLeavePromptProperties) {
                            MentorshipProgramLeavePromptProperties mentorshipProgramLeavePromptProperties = (MentorshipProgramLeavePromptProperties) this;
                            A12 = AnonymousClass001.A12();
                            try {
                                A12.put("mentorship_program_id", mentorshipProgramLeavePromptProperties.A01);
                                A12.put("num_days_after_program_create", mentorshipProgramLeavePromptProperties.A00);
                                return A12;
                            } catch (JSONException e8) {
                                e = e8;
                                str2 = "MentorshipProgramLeavePromptProperties";
                            }
                        } else {
                            if (this instanceof LinkCTAAdminTextProperties) {
                                LinkCTAAdminTextProperties linkCTAAdminTextProperties = (LinkCTAAdminTextProperties) this;
                                JSONObject A126 = AnonymousClass001.A12();
                                A126.put("link_cta_xmat_primary_text", linkCTAAdminTextProperties.A04);
                                A126.put("link_cta_xmat_cta_text", linkCTAAdminTextProperties.A01);
                                A126.put("link_cta_xmat_cta_url", linkCTAAdminTextProperties.A02);
                                A126.put("android_uri", linkCTAAdminTextProperties.A00);
                                A126.put("identifier_name", linkCTAAdminTextProperties.A03);
                                return A126;
                            }
                            if (this instanceof LeadFormsOptOutAdminMessageProperties) {
                                LeadFormsOptOutAdminMessageProperties leadFormsOptOutAdminMessageProperties = (LeadFormsOptOutAdminMessageProperties) this;
                                A12 = AnonymousClass001.A12();
                                try {
                                    A12.put("messenger_lead_form_opt_out_xmat_text", leadFormsOptOutAdminMessageProperties.A00);
                                    return A12;
                                } catch (JSONException e9) {
                                    e = e9;
                                    cls = LeadFormsOptOutAdminMessageProperties.class;
                                    str = "Failed to serialize LeadFormsOptOutAdminMessageProperties to Json";
                                }
                            } else {
                                DetectedOutcomeAdminMessageProperties detectedOutcomeAdminMessageProperties = (DetectedOutcomeAdminMessageProperties) this;
                                A12 = AnonymousClass001.A12();
                                try {
                                    String str7 = detectedOutcomeAdminMessageProperties.A01;
                                    if (str7 != null) {
                                        A12.put("android_uri", str7);
                                    }
                                    String str8 = detectedOutcomeAdminMessageProperties.A02;
                                    if (str8 != null) {
                                        A12.put("primary_text", str8);
                                    }
                                    String str9 = detectedOutcomeAdminMessageProperties.A00;
                                    if (str9 != null) {
                                        A12.put("activity_type", str9);
                                    }
                                    A12.put("is_redesign", detectedOutcomeAdminMessageProperties.A03);
                                    return A12;
                                } catch (JSONException e10) {
                                    e = e10;
                                    cls = DetectedOutcomeAdminMessageProperties.class;
                                    str = "Failed to serialize DetectedOutcomeAdminMessageProperties to Json";
                                }
                            }
                        }
                    }
                }
            }
            0fH.A0p(str2, "Failed to serialize to json: ", e);
            return A12;
        }
        ServiceBookingLegalDisclaimerXMATProperties serviceBookingLegalDisclaimerXMATProperties = (ServiceBookingLegalDisclaimerXMATProperties) this;
        A12 = AnonymousClass001.A12();
        try {
            A12.put("service_booking_legal_disclaimer_admin_text", serviceBookingLegalDisclaimerXMATProperties.A00);
            return A12;
        } catch (JSONException e11) {
            e = e11;
            cls = ServiceBookingLegalDisclaimerXMATProperties.class;
            str = "Failed to serialize ServiceBookingLegalDisclaimerXMATProperties to Json";
        }
        0fH.A0H(cls, str, e);
        return A12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
