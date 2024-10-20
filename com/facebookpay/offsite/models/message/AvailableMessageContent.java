package com.facebookpay.offsite.models.message;

import X.11T;

/* loaded from: AvailableMessageContent.class */
public final class AvailableMessageContent {
    public final String availability;
    public final String flags;
    public final boolean isProactiveCheckoutAvailable;

    public AvailableMessageContent(String str, boolean z, String str2) {
        11T.A0F(str, 1);
        this.availability = str;
        this.isProactiveCheckoutAvailable = z;
        this.flags = str2;
    }

    public final String getAvailability() {
        return this.availability;
    }

    public final String getFlags() {
        return this.flags;
    }

    public final boolean isProactiveCheckoutAvailable() {
        return this.isProactiveCheckoutAvailable;
    }
}
