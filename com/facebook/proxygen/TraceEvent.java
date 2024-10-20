package com.facebook.proxygen;

import X.0FI;
import X.0Pz;
import X.1BK;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.Map;

/* loaded from: TraceEvent.class */
public class TraceEvent extends NativeHandleImpl {
    public final long mEnd;
    public final int mID;
    public final String mName;
    public final int mParentID;
    public final long mStart;

    public TraceEvent(String str) {
        this.mName = str;
        this.mID = 0;
        this.mParentID = 0;
        this.mStart = 0L;
        this.mEnd = 0L;
    }

    public TraceEvent(String str, int i, int i2, long j, long j2) {
        this.mName = str;
        this.mID = i;
        this.mParentID = i2;
        this.mStart = j;
        this.mEnd = j2;
    }

    public native void close();

    public void finalize() {
        int A03 = 0FI.A03(1705944894);
        close();
        0FI.A09(1066213217, A03);
    }

    public long getEnd() {
        return this.mEnd;
    }

    public int getId() {
        return this.mID;
    }

    public native Map getMetaData();

    public String getName() {
        return this.mName;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public long getStart() {
        return this.mStart;
    }

    public String toPrettyJson() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{\n  \"name\":\"");
        A0k.append(this.mName);
        A0k.append("\",\n  \"id\":");
        A0k.append(this.mID);
        A0k.append(",\n  \"parentID\":");
        A0k.append(this.mParentID);
        A0k.append(",\n  \"start\":");
        A0k.append(this.mStart);
        A0k.append(",\n  \"end\":");
        A0k.append(this.mEnd);
        stringBuffer.append(AnonymousClass001.A0d(",\n  \"metaData\":{\n", A0k));
        Iterator A0y = AnonymousClass001.A0y(getMetaData());
        boolean z = true;
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (!z) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(0Pz.A0j("    \"", AnonymousClass001.A0j(A0z), "\":\""));
            int length = 1BK.A16(A0z).length();
            StringBuilder A0k2 = AnonymousClass001.A0k();
            String A16 = 1BK.A16(A0z);
            if (length > 100) {
                A0k2.append(A16.substring(0, 97));
                str = "...\"";
            } else {
                A0k2.append(A16);
                str = "\"";
            }
            stringBuffer.append(AnonymousClass001.A0d(str, A0k2));
            z = false;
        }
        stringBuffer.append("\n  }\n}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TraceEvent(name='");
        A0k.append(this.mName);
        A0k.append("', id='");
        A0k.append(this.mID);
        A0k.append("', parentID='");
        A0k.append(this.mParentID);
        A0k.append("', start='");
        A0k.append(this.mStart);
        A0k.append("', end='");
        A0k.append(this.mEnd);
        stringBuffer.append(AnonymousClass001.A0d("', metaData='{", A0k));
        Iterator A0y = AnonymousClass001.A0y(getMetaData());
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            stringBuffer.append(0Pz.A0v(AnonymousClass001.A0j(A0z), ": ", 1BK.A16(A0z), ", "));
        }
        stringBuffer.append("}')");
        return stringBuffer.toString();
    }
}
