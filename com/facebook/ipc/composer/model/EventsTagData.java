package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: EventsTagData.class */
public final class EventsTagData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(84);
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* loaded from: EventsTagData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Long l = null;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1526966919:
                                if (A1C.equals("start_timestamp")) {
                                    l = (Long) AbstractC11224vw.A02(abstractC01033pi, c27t, Long.class);
                                    break;
                                }
                                break;
                            case 943500218:
                                if (A1C.equals("event_location")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 984174864:
                                if (A1C.equals("event_name")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 1796349783:
                                if (A1C.equals("cover_photo_uri")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                            case 2012368418:
                                if (A1C.equals("is_from_intercept")) {
                                    bool = (Boolean) AbstractC11224vw.A02(abstractC01033pi, c27t, Boolean.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, EventsTagData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new EventsTagData(bool, l, str, str2, str3);
        }
    }

    /* loaded from: EventsTagData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            EventsTagData eventsTagData = (EventsTagData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "cover_photo_uri", eventsTagData.A02);
            AbstractC11224vw.A0D(r302, "event_location", eventsTagData.A03);
            AbstractC11224vw.A0D(r302, "event_name", eventsTagData.A04);
            AbstractC11224vw.A08(r302, eventsTagData.A00, "is_from_intercept");
            AbstractC11224vw.A0C(r302, eventsTagData.A01, "start_timestamp");
            r302.A0Y();
        }
    }

    public EventsTagData(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        this.A01 = AbN.A0h(parcel);
    }

    public EventsTagData(Boolean bool, Long l, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = bool;
        this.A01 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventsTagData)) {
                return false;
            }
            EventsTagData eventsTagData = (EventsTagData) obj;
            if (!11T.A0O(this.A02, eventsTagData.A02) || !11T.A0O(this.A03, eventsTagData.A03) || !11T.A0O(this.A04, eventsTagData.A04) || !11T.A0O(this.A00, eventsTagData.A00) || !11T.A0O(this.A01, eventsTagData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        AbN.A0s(parcel, this.A00);
        C3o5.A0g(parcel, this.A01);
    }
}
