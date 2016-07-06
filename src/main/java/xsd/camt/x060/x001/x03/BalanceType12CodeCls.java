/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class BalanceType12CodeCls.The BalanceType12Code atomic simple
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class BalanceType12CodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile BalanceType12CodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected BalanceType12CodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12CodeCls();
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
        setName("BalanceType12Code");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
        addValidator(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12CodeCls.BalanceType12Code1Enum.getInstance());
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class BalanceType12Code1Enum.The BalanceType12Code
     * enumeration.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class BalanceType12Code1Enum extends biz.c24.io.api.data.DefaultEnumeration {

        /**
         * Field instance.
         */
        private static biz.c24.io.api.data.Enumeration instance;

        private BalanceType12Code1Enum() {
            setName("BalanceType12Code");
            addEntry("XPCD", "", null);
            addEntry("OPAV", "", null);
            addEntry("ITAV", "", null);
            addEntry("CLAV", "", null);
            addEntry("FWAV", "", null);
            addEntry("CLBD", "", null);
            addEntry("ITBD", "", null);
            addEntry("OPBD", "", null);
            addEntry("PRCD", "", null);
            addEntry("INFO", "", null);
        }

        /**
         */
        public static biz.c24.io.api.data.Enumeration getInstance() {
            if (instance == null)
                instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.BalanceType12CodeCls.BalanceType12Code1Enum();

            return instance;
        }

    }

}
