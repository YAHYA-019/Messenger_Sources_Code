package com.facebook.common.fury.reliability.sapienz;

import X.3Av;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C0jk;
import X.C28b;
import X.Jy1;
import X.Liw;
import android.content.Context;
import com.facebook.fury.context.ReqContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: StackTraceReportCreator.class */
public final class StackTraceReportCreator implements Runnable {
    public static ReqContext A06;
    public int A00;
    public Context A01;
    public String A02;
    public Thread A03;
    public Thread A04;
    public Throwable A05;
    public static Map parentCtxIds = AnonymousClass001.A0u();
    public static AnonymousClass244 A07 = new AnonymousClass244();

    static {
        C28b c28b = new 3Av();
        Object obj = new Object();
        Jy1 jy1 = ((3Av) c28b)._deserializers;
        if (jy1 == null) {
            jy1 = new Jy1();
            ((3Av) c28b)._deserializers = jy1;
        }
        Liw liw = new Liw(C0jk.class);
        HashMap hashMap = jy1._classMappings;
        if (hashMap == null) {
            hashMap = AnonymousClass001.A0u();
            jy1._classMappings = hashMap;
        }
        hashMap.put(liw, obj);
        A07.A0Y(c28b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02da, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e3, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0330, code lost:
    
        X.0fH.A0j("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", X.0Pz.A0d("Fury event chain with size: ", " found.", r0.size()));
        r0.add(new X.C0jk(r317, r0, 4, java.lang.System.currentTimeMillis()));
        X.0fH.A0j("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", "Begin formatting fury async stacktrace report");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0380, code lost:
    
        r0 = X.AnonymousClass001.A12();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x038f, code lost:
    
        r0.put(com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03a3, code lost:
    
        r0.put("event_chain_size", r0.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03ae, code lost:
    
        r0 = new org.json.JSONArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b5, code lost:
    
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03ba, code lost:
    
        r333 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03cf, code lost:
    
        r0 = (X.C0jk) r0.get(r333);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d6, code lost:
    
        r0 = X.AnonymousClass001.A1Q(r333, r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03e5, code lost:
    
        r0 = X.AnonymousClass001.A12();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0401, code lost:
    
        r0 = new java.text.SimpleDateFormat(X.1BJ.A00(61), java.util.Locale.US);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0408, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x040e, code lost:
    
        r0 = X.AbI.A1E(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0415, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x041c, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0427, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0437, code lost:
    
        r0.put("time", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0446, code lost:
    
        r0.put("date", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0457, code lost:
    
        if (r0 != 3) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0462, code lost:
    
        if (r0 != 4) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x046c, code lost:
    
        if (r0 != 5) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0472, code lost:
    
        r314 = "REQ_CONTEXT_FAIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0492, code lost:
    
        r0.put("event_type", r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04a9, code lost:
    
        r0.put(X.AnonymousClass000.A00(com.facebook.acra.constants.ActionId.VIEW_DID_LOAD_BEGIN), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b8, code lost:
    
        r0.put("thread_id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04c2, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04d5, code lost:
    
        r0.put("req_context_tag", r0.getTag());
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04e8, code lost:
    
        r310 = com.facebook.fury.context.ReqContextTypeResolver.resolveType(r0.getType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04f1, code lost:
    
        if (r310 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04f4, code lost:
    
        r310 = "UNKNOWN_TYPE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04fc, code lost:
    
        r0.put("req_context_type", r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0512, code lost:
    
        r0.put("req_context_flag_current_tid", r0.getCurrentTid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0528, code lost:
    
        r0.put("req_context_flag_parent_tid", r0.getParentTid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x053e, code lost:
    
        r0.put("req_context_flag_current_seq_id", r0.getCurrentSeqId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0554, code lost:
    
        r0.put("req_context_flag_parent_seq_id", r0.getParentSeqId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x055c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0570, code lost:
    
        r0.put("req_context_req_chain_props", r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0584, code lost:
    
        r0.put("req_context_req_context_props", r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x058b, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0592, code lost:
    
        if (r0 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0595, code lost:
    
        r0 = r0.getStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x059e, code lost:
    
        if (r0 != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05aa, code lost:
    
        X.L5y.A02(java.util.Arrays.asList(r0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05bb, code lost:
    
        X.L5y.A02(X.L5y.A00(r0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05d3, code lost:
    
        r0.put(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05db, code lost:
    
        r333 = r333 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x048a, code lost:
    
        r314 = "UNKNOWN_REASON";
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x047a, code lost:
    
        r314 = "REQ_CONTEXT_DEACTIVATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0482, code lost:
    
        r314 = "REQ_CONTEXT_ACTIVATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05c3, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x05cd, code lost:
    
        X.0fH.A0r("StacktraceFlowCollectorUtil", "Error while processing the event json", r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x05eb, code lost:
    
        r0.put("event_chain", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x05f3, code lost:
    
        X.0fH.A0j("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", "Begin writing fury async stacktrace report to file");
        X.L5y.A01(r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0609, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x060a, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x060b, code lost:
    
        X.0fH.A0r("StacktraceFlowCollectorUtil", "Error in formatReport. JSON exception while formatting report", r302);
        X.0fH.A0j("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", "Async stacktrace chain report couldn't be serialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x061c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02eb, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02fd, code lost:
    
        throw r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02fe, code lost:
    
        r314 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0300, code lost:
    
        r302 = X.AnonymousClass001.A0k();
        r310 = "Error while processing ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0315, code lost:
    
        r302.append(r310);
        X.0fH.A0p("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", X.AnonymousClass001.A0d(r0.getName(), r302), r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x030b, code lost:
    
        r314 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x030d, code lost:
    
        r302 = X.AnonymousClass001.A0k();
        r310 = "Error while reading ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0074, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01da, code lost:
    
        if (r317 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        X.0fH.A0j("com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator", "Found a ReqContext which has failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
    
        r0 = X.AnonymousClass001.A0s();
        r314 = com.facebook.common.fury.reliability.sapienz.StackTraceChainCreator.A00(r317.getParentTid(), r317.getParentSeqId());
        r0 = X.AnonymousClass001.A0v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021c, code lost:
    
        if (com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator.parentCtxIds.containsKey(r314) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021f, code lost:
    
        r0.add(r314);
        r0 = com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator.parentCtxIds.get(r314);
        com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator.parentCtxIds.remove(r314);
        r314 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0247, code lost:
    
        r0 = X.AnonymousClass001.A0D(r0.getFilesDir(), "fury_events.txt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x025e, code lost:
    
        r0 = new java.io.FileInputStream(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026f, code lost:
    
        r0 = new X.AnonymousClass259().A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027b, code lost:
    
        r0.A1h(com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0281, code lost:
    
        r0.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028d, code lost:
    
        if (r0.A1m() == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029c, code lost:
    
        r0 = (X.C0jk) r0.A1W(X.C0jk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a5, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a8, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d5, code lost:
    
        if (r0.contains(com.facebook.common.fury.reliability.sapienz.StackTraceChainCreator.A00(r0.getCurrentTid(), r0.getCurrentSeqId())) == false) goto L296;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01c8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.fury.reliability.sapienz.StackTraceReportCreator.run():void");
    }
}
