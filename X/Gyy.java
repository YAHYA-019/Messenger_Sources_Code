package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import com.facebook.rtc.logging.connectfunnel.structuredlogger.StructuredAnalyticsLoggerConverter;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: Gyy.class */
public final class Gyy extends ConnectFunnelProxy {
    public final 1gT A00;
    public final String A01;

    public Gyy(1gT r302, String str) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = str;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public McfReference createStructuredLoggerPointer() {
        XAnalyticsHolder BL6 = this.A00.BL6();
        11T.A0A(BL6);
        return new StructuredAnalyticsLoggerConverter(BL6).convertToMcfReference();
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public String diskCachingCreateDirectory() {
        return this.A01;
    }

    @Override // com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy
    public boolean diskCachingIsEnabled() {
        return AnonymousClass001.A1T(this.A01);
    }
}
