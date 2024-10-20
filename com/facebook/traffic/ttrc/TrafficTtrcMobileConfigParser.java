package com.facebook.traffic.ttrc;

import X.0fH;
import X.1BO;
import android.text.TextUtils;
import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: TrafficTtrcMobileConfigParser.class */
public class TrafficTtrcMobileConfigParser {
    public static final String TAG = "TrafficTtrcMobileConfigParser";
    public final AtomicReference mMarkerIds = new AtomicReference(new MarkerIds());

    /* loaded from: TrafficTtrcMobileConfigParser$MarkerIds.class */
    public class MarkerIds {
        public static final String DELIMITER = "[, ]";
        public static final String EMPTY_STRING = "";
        public final Set mMarkerIds;
        public final String mMarkerIdsString;

        public MarkerIds() {
            this("");
        }

        public MarkerIds(String str) {
            this.mMarkerIdsString = str;
            this.mMarkerIds = parseMarkerIds(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.util.AbstractCollection, java.lang.Object, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.util.HashSet] */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
        public static Set parseMarkerIds(String str) {
            ?? r0;
            TextUtils.isEmpty(str);
            if (0 == 0) {
                new HashSet();
                int length = str.split(DELIMITER).length;
                r0 = 0;
                while (true) {
                    int i = r0;
                    if (i >= r0) {
                        break;
                    }
                    try {
                        ?? valueOf = Integer.valueOf(Integer.parseInt(r0[i]));
                        valueOf.add(valueOf);
                    } catch (NumberFormatException e) {
                        String str2 = TrafficTtrcMobileConfigParser.TAG;
                        ?? r02 = new Object[2];
                        r02[0] = r02;
                        r02[1] = str;
                        0fH.A0z("Invalid QPL marker ID %s from MC (%s)", "Invalid QPL marker ID %s from MC (%s)", e, "Invalid QPL marker ID %s from MC (%s)");
                    }
                    r0 = i + 1;
                }
            } else {
                r0 = new HashSet(0);
            }
            return r0;
        }
    }

    public static final TrafficTtrcMobileConfigParser _UL__ULSEP_com_facebook_traffic_ttrc_TrafficTtrcMobileConfigParser_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new TrafficTtrcMobileConfigParser();
    }

    public Set parseMarkerIds(String str) {
        if (!Objects.equal(((MarkerIds) this.mMarkerIds.get()).mMarkerIdsString, str)) {
            this.mMarkerIds.set(new MarkerIds(str));
        }
        return ((MarkerIds) this.mMarkerIds.get()).mMarkerIds;
    }
}
