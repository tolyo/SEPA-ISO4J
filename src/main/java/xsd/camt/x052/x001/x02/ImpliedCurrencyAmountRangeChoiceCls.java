/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class ImpliedCurrencyAmountRangeChoiceCls.The
 * ImpliedCurrencyAmountRangeChoice complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice
 */
public class ImpliedCurrencyAmountRangeChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ImpliedCurrencyAmountRangeChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ImpliedCurrencyAmountRangeChoiceCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("ImpliedCurrencyAmountRangeChoice");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("ImpliedCurrencyAmountRangeChoice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.ImpliedCurrencyAmountRangeChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class ImpliedCurrencyAmountRangeChoiceSG1Cls.The
     * ImpliedCurrencyAmountRangeChoice-SG1 complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1
     */
    public static class ImpliedCurrencyAmountRangeChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.ImpliedCurrencyAmountRangeChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected ImpliedCurrencyAmountRangeChoiceSG1Cls() {
        }

        /**
         * Gets the singleton instance of this type.
         * 
         * @return The type, or its supertype if present.
         */
        public static biz.c24.io.api.data.DataType getInstance() {
            if (!initialized)
            {
                synchronized (biz.c24.io.api.data.ComplexDataType.class)
                {
                    if (instance == null)
                    {
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoiceCls.ImpliedCurrencyAmountRangeChoiceSG1Cls();
                        instance.init();
                        initialized = true;
                    }
                }
            }
            return instance;
        }

        /**
         * Called internally to initialize this type.
         */
        protected void init() {
            setName("ImpliedCurrencyAmountRangeChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
            setOriginalName("ImpliedCurrencyAmountRangeChoice-SG1");
            setDatabaseColumnName("ImpliedCurrencyAmountRangeChoice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAmountRangeChoice.ImpliedCurrencyAmountRangeChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("FrAmt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("ToAmt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.AmountRangeBoundary1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("FrToAmt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.FromToAmountRangeCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("EQAmt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAndAmountCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("NEQAmt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAndAmountCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
