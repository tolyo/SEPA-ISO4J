/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class CashBalanceAvailabilityDate1Cls.The
 * CashBalanceAvailabilityDate1 complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1
 */
public class CashBalanceAvailabilityDate1Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile CashBalanceAvailabilityDate1Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CashBalanceAvailabilityDate1Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls();
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
        setName("CashBalanceAvailabilityDate1");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("CashBalanceAvailabilityDate1-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.CashBalanceAvailabilityDate1SG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class CashBalanceAvailabilityDate1SG1Cls.The
     * CashBalanceAvailabilityDate1-SG1 complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1
     */
    public static class CashBalanceAvailabilityDate1SG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.CashBalanceAvailabilityDate1SG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected CashBalanceAvailabilityDate1SG1Cls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1Cls.CashBalanceAvailabilityDate1SG1Cls();
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
            setName("CashBalanceAvailabilityDate1SG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
            setOriginalName("CashBalanceAvailabilityDate1-SG1");
            setDatabaseColumnName("CashBalanceAvailabilityDate1-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CashBalanceAvailabilityDate1.CashBalanceAvailabilityDate1SG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("NbOfDays", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Max15PlusSignedNumericTextCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("ActlDt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ISODateCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
