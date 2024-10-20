package com.facebook.messaging.location.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: NearbyPlaceSerializer.class */
public class NearbyPlaceSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), NearbyPlace.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        NearbyPlace nearbyPlace = (NearbyPlace) obj;
        if (nearbyPlace == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, nearbyPlace.id);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, nearbyPlace.name);
        AbstractC11224vw.A0D(r302, "profilePicUriString", nearbyPlace.profilePicUriString);
        AbstractC11224vw.A09(r302, nearbyPlace.latitude, Location.LATITUDE);
        AbstractC11224vw.A09(r302, nearbyPlace.longitude, "longitude");
        AbstractC11224vw.A0D(r302, "distance", nearbyPlace.distance);
        AbstractC11224vw.A0D(r302, "fullAddress", nearbyPlace.fullAddress);
        boolean z = nearbyPlace.isPage;
        r302.A0o("isPage");
        r302.A0v(z);
        boolean z2 = nearbyPlace.isFreeForm;
        r302.A0o("isFreeForm");
        r302.A0v(z2);
        boolean z3 = nearbyPlace.isRecent;
        r302.A0o("isRecent");
        r302.A0v(z3);
        boolean z4 = nearbyPlace.isSectionHeader;
        r302.A0o("isSectionHeader");
        r302.A0v(z4);
        AbstractC11224vw.A0D(r302, "categoryIconNameString", nearbyPlace.categoryIconNameString);
        AbstractC11224vw.A09(r302, nearbyPlace.distanceInMeters, "distanceInMeters");
        r302.A0Y();
    }
}
