package X;

import com.facebook.advancedcryptotransport.AppInstallContext;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Set;

/* renamed from: X.1yw, reason: invalid class name */
/* loaded from: 1yw.class */
public final class C1yw implements C1yx {
    public static final Set A0A = new SingletonImmutableSet(C1yy.A00);
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1HN A08;
    public volatile boolean A09;

    public C1yw(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A00 = r303;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 16671);
        this.A03 = 1Lm.A03(fbUserSession, r0, 16892);
        this.A07 = 1Lm.A03(fbUserSession, r0, 16959);
        this.A06 = 1Lm.A03(fbUserSession, r0, 16958);
        this.A01 = 1Bq.A00(16616);
        this.A02 = 1Bq.A00(33013);
        this.A04 = 1Bu.A03(r0, 33152);
        1HO r02 = new 1HN() { // from class: X.1yz
            public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r3032) {
                11T.A0F(fbSharedPreferences, 0);
                AppInstallContext.mShouldSimulateFutureVersion = fbSharedPreferences.AZn(C1yy.A00, false);
            }
        };
        this.A08 = r02;
        ((FbSharedPreferences) this.A02.A00.get()).CcW(r02, A0A);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(162:91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|1e7|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|(39:142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180)|181|182|183|184|185|186|(4:188|189|190|191)(3:389|390|(4:392|393|394|395)(237:396|397|398|(1:400)|401|402|403|(1:405)|406|407|408|409|410|(1:597)(7:414|415|416|417|418|419|420)|421|422|423|(4:425|426|427|(5:429|430|431|432|(4:434|435|436|(4:438|439|440|441))))|442|443|444|445|446|447|448|449|450|451|452|(10:454|455|456|457|458|459|460|461|462|463)|464|465|466|467|468|469|470|471|472|(17:474|475|476|477|478|479|480|481|482|483|484|485|(4:487|488|489|490)|491|492|493|(4:495|496|497|498))|499|500|501|(1:503)|504|505|506|507|508|509|510|511|512|(1:514)|515|516|(1:518)|519|520|(1:522)|523|524|(1:526)|527|528|(1:530)|531|532|533|(1:535)|536|537|538|(1:540)|541|542|543|544|545|546|(2:548|549)|596|551|(1:553)|554|555|556|557|558|559|560|561|562|563|564|(1:566)|567|568|569|570|571|572|573|574|575|576|577|578|579|580|581|582|583|584|585|586|587|588|589|590|591|592|(2:594|595)|194|195|196|197|(41:199|200|201|202|203|205|206|207|208|209|210|211|212|213|214|(1:222)|223|224|225|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|(4:248|249|250|251)(5:366|367|368|369|(5:371|372|373|374|375)(5:376|377|378|379|380)))(2:387|388)|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|(2:289|290)|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|347|348|349|350|351|352|353|354|355|356|357|358|359|360|361|362))|192|193|194|195|196|197|(0)(0)|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|(0)|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|347|348|349|350|351|352|353|354|355|356|357|358|359|360|361|362) */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0a18, code lost:
    
        r356 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x06dd, code lost:
    
        if (r0.A04 != false) goto L358;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x039d A[Catch: InterruptedException | ExecutionException -> 0x0be2, InterruptedException | ExecutionException -> 0x0be2, all -> 0x0c1f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {InterruptedException | ExecutionException -> 0x0be2, blocks: (B:130:0x022d, B:130:0x022d, B:131:0x0233, B:131:0x0233, B:133:0x023a, B:133:0x023a, B:134:0x023f, B:134:0x023f, B:136:0x024a, B:136:0x024a, B:137:0x0253, B:137:0x0253, B:139:0x0261, B:139:0x0261, B:142:0x026d, B:142:0x026d, B:143:0x0272, B:143:0x0272, B:144:0x0277, B:144:0x0277, B:145:0x027e, B:145:0x027e, B:146:0x0287, B:146:0x0287, B:147:0x028e, B:147:0x028e, B:148:0x0293, B:148:0x0293, B:149:0x029a, B:150:0x02a3, B:150:0x02a3, B:152:0x02ac, B:152:0x02ac, B:154:0x02b4, B:154:0x02b4, B:156:0x02ba, B:156:0x02ba, B:158:0x02bf, B:158:0x02bf, B:160:0x02c6, B:160:0x02c6, B:161:0x02cc, B:161:0x02cc, B:163:0x02d7, B:163:0x02d7, B:164:0x02dd, B:164:0x02dd, B:166:0x02e8, B:166:0x02e8, B:167:0x02ee, B:167:0x02ee, B:168:0x02f5, B:168:0x02f5, B:169:0x02fc, B:169:0x02fc, B:170:0x0303, B:170:0x0303, B:172:0x030f, B:172:0x030f, B:174:0x031f, B:174:0x031f, B:176:0x032f, B:176:0x032f, B:178:0x033f, B:178:0x033f, B:180:0x0352, B:180:0x0352, B:181:0x0357, B:181:0x0357, B:181:0x0357, B:181:0x0357, B:183:0x035c, B:183:0x035c, B:185:0x0362, B:185:0x0362, B:188:0x036f, B:188:0x036f, B:190:0x0377, B:190:0x0377, B:193:0x0383, B:193:0x0383, B:195:0x038a, B:195:0x038a, B:196:0x0391, B:196:0x0391, B:199:0x039d, B:199:0x039d, B:200:0x03a4, B:200:0x03a4, B:201:0x03ab, B:201:0x03ab, B:205:0x084d, B:205:0x084d, B:206:0x0854, B:206:0x0854, B:208:0x0861, B:208:0x0861, B:210:0x0868, B:210:0x0868, B:211:0x086f, B:211:0x086f, B:213:0x087d, B:213:0x087d, B:216:0x0889, B:216:0x0889, B:217:0x0892, B:217:0x0892, B:219:0x08a0, B:219:0x08a0, B:222:0x08ac, B:222:0x08ac, B:224:0x08b3, B:224:0x08b3, B:225:0x08ba, B:225:0x08ba, B:226:0x08c1, B:226:0x08c1, B:227:0x08c8, B:227:0x08c8, B:229:0x08cf, B:229:0x08cf, B:230:0x08d5, B:230:0x08d5, B:232:0x08e4, B:232:0x08e4, B:234:0x08ea, B:234:0x08ea, B:235:0x08f1, B:235:0x08f1, B:236:0x08f8, B:236:0x08f8, B:238:0x0901, B:238:0x0901, B:239:0x0907, B:239:0x0907, B:241:0x0916, B:241:0x0916, B:242:0x091a, B:242:0x091a, B:242:0x091a, B:242:0x091a, B:245:0x0921, B:245:0x0921, B:248:0x092b, B:248:0x092b, B:249:0x0934, B:249:0x0934, B:251:0x093d, B:251:0x093d, B:253:0x0944, B:253:0x0944, B:254:0x0949, B:254:0x0949, B:255:0x0952, B:255:0x0952, B:257:0x095e, B:257:0x095e, B:259:0x0967, B:259:0x0967, B:261:0x0975, B:261:0x0975, B:262:0x097c, B:262:0x097c, B:263:0x0983, B:263:0x0983, B:264:0x098c, B:264:0x098c, B:265:0x0993, B:265:0x0993, B:266:0x099a, B:266:0x099a, B:267:0x09a1, B:267:0x09a1, B:268:0x09a6, B:268:0x09a6, B:270:0x09ff, B:270:0x09ff, B:271:0x0a04, B:271:0x0a04, B:273:0x0a0b, B:273:0x0a0b, B:274:0x0a10, B:274:0x0a10, B:275:0x0a22, B:275:0x0a22, B:276:0x0a29, B:276:0x0a29, B:278:0x0a35, B:278:0x0a35, B:279:0x0a3e, B:279:0x0a3e, B:281:0x0a43, B:281:0x0a43, B:282:0x0a48, B:282:0x0a48, B:282:0x0a48, B:282:0x0a48, B:285:0x0a5e, B:285:0x0a5e, B:286:0x0a65, B:286:0x0a65, B:290:0x0a72, B:290:0x0a72, B:292:0x0a78, B:292:0x0a78, B:294:0x0a7e, B:294:0x0a7e, B:296:0x0a87, B:296:0x0a87, B:298:0x0a90, B:298:0x0a90, B:299:0x0a97, B:299:0x0a97, B:301:0x0a9f, B:301:0x0a9f, B:302:0x0aa4, B:302:0x0aa4, B:303:0x0aab, B:303:0x0aab, B:305:0x0abd, B:305:0x0abd, B:307:0x0ac3, B:307:0x0ac3, B:309:0x0ad6, B:309:0x0ad6, B:311:0x0adc, B:311:0x0adc, B:313:0x0aec, B:313:0x0aec, B:314:0x0af0, B:314:0x0af0, B:314:0x0af0, B:314:0x0af0, B:317:0x0afa, B:317:0x0afa, B:318:0x0b00, B:318:0x0b00, B:319:0x0b07, B:319:0x0b07, B:366:0x09ae, B:366:0x09ae, B:368:0x09b5, B:368:0x09b5, B:371:0x09bf, B:371:0x09bf, B:372:0x09c5, B:372:0x09c5, B:373:0x09ce, B:373:0x09ce, B:375:0x09d9, B:375:0x09d9, B:377:0x09e4, B:377:0x09e4, B:378:0x09ed, B:378:0x09ed, B:380:0x09f8, B:380:0x09f8, B:388:0x0846, B:388:0x0846, B:389:0x03db, B:389:0x03db, B:392:0x03e4, B:392:0x03e4, B:394:0x03ec, B:394:0x03ec, B:397:0x0401, B:397:0x0401, B:402:0x0419, B:402:0x0419, B:407:0x0431, B:407:0x0431, B:409:0x043f, B:409:0x043f, B:415:0x046d, B:415:0x046d, B:417:0x0474, B:417:0x0474, B:419:0x0492, B:419:0x0492, B:422:0x04a9, B:422:0x04a9, B:426:0x04b9, B:426:0x04b9, B:430:0x04c5, B:430:0x04c5, B:431:0x04ce, B:431:0x04ce, B:435:0x04e1, B:435:0x04e1, B:439:0x04f4, B:439:0x04f4, B:441:0x04fb, B:441:0x04fb, B:443:0x04ff, B:443:0x04ff, B:444:0x0503, B:444:0x0503, B:444:0x0503, B:444:0x0503, B:447:0x050b, B:447:0x050b, B:448:0x0510, B:448:0x0510, B:450:0x0516, B:450:0x0516, B:451:0x051b, B:451:0x051b, B:455:0x0528, B:455:0x0528, B:457:0x0530, B:457:0x0530, B:458:0x0536, B:458:0x0536, B:459:0x053b, B:459:0x053b, B:459:0x053b, B:459:0x053b, B:462:0x0543, B:462:0x0543, B:463:0x0548, B:463:0x0548, B:466:0x0550, B:466:0x0550, B:468:0x0558, B:468:0x0558, B:469:0x055e, B:469:0x055e, B:471:0x0564, B:471:0x0564, B:474:0x056e, B:474:0x056e, B:475:0x0575, B:475:0x0575, B:477:0x058b, B:477:0x058b, B:479:0x0591, B:479:0x0591, B:480:0x0596, B:480:0x0596, B:482:0x05a9, B:482:0x05a9, B:484:0x05ae, B:484:0x05ae, B:487:0x05b8, B:487:0x05b8, B:488:0x05bf, B:488:0x05bf, B:490:0x05d2, B:490:0x05d2, B:492:0x05d7, B:492:0x05d7, B:495:0x05e1, B:495:0x05e1, B:496:0x05e8, B:496:0x05e8, B:498:0x05fb, B:498:0x05fb, B:499:0x05ff, B:499:0x05ff, B:499:0x05ff, B:499:0x05ff, B:504:0x0612, B:504:0x0612, B:505:0x0618, B:505:0x0618, B:506:0x061e, B:506:0x061e, B:508:0x062d, B:508:0x062d, B:509:0x0634, B:509:0x0634, B:511:0x063f, B:511:0x063f, B:515:0x064d, B:515:0x064d, B:519:0x065b, B:519:0x065b, B:523:0x0669, B:523:0x0669, B:527:0x0677, B:527:0x0677, B:530:0x0681, B:530:0x0681, B:531:0x0686, B:531:0x0686, B:532:0x068d, B:532:0x068d, B:535:0x0697, B:535:0x0697, B:536:0x069c, B:536:0x069c, B:537:0x06a3, B:537:0x06a3, B:541:0x06b2, B:541:0x06b2, B:543:0x06bb, B:543:0x06bb, B:545:0x06c7, B:545:0x06c7, B:548:0x06d3, B:548:0x06d3, B:553:0x06e8, B:553:0x06e8, B:554:0x06ef, B:554:0x06ef, B:555:0x06f4, B:555:0x06f4, B:557:0x06ff, B:557:0x06ff, B:559:0x070a, B:559:0x070a, B:560:0x0711, B:560:0x0711, B:562:0x071b, B:562:0x071b, B:563:0x0720, B:563:0x0720, B:567:0x072d, B:567:0x072d, B:568:0x0734, B:568:0x0734, B:570:0x073d, B:570:0x073d, B:572:0x074b, B:572:0x074b, B:573:0x0752, B:573:0x0752, B:574:0x0759, B:574:0x0759, B:575:0x0760, B:575:0x0760, B:576:0x0766, B:576:0x0766, B:578:0x0770, B:578:0x0770, B:580:0x0777, B:580:0x0777, B:582:0x077e, B:582:0x077e, B:583:0x0785, B:583:0x0785, B:585:0x078c, B:585:0x078c, B:586:0x0792, B:586:0x0792, B:587:0x0798, B:587:0x0798, B:587:0x0798, B:587:0x0798, B:590:0x07e7, B:590:0x07e7, B:591:0x07ed, B:591:0x07ed, B:595:0x07fd, B:595:0x07fd), top: B:129:0x022d, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0834  */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C1yx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture AQX() {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1yw.AQX():com.google.common.util.concurrent.ListenableFuture");
    }
}