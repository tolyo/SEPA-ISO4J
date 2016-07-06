/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class DateAndDateTimeChoiceCls.The DateAndDateTimeChoice complex
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice
 */
public class DateAndDateTimeChoiceCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile DateAndDateTimeChoiceCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected DateAndDateTimeChoiceCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls();
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
        setName("DateAndDateTimeChoice");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("DateAndDateTimeChoice-SG1", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.DateAndDateTimeChoiceSG1Cls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
        element.setGroup(true);
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class DateAndDateTimeChoiceSG1Cls.The
     * DateAndDateTimeChoice-SG1 complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24.biz)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1
     */
    public static class DateAndDateTimeChoiceSG1Cls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.DateAndDateTimeChoiceSG1Cls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected DateAndDateTimeChoiceSG1Cls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoiceCls.DateAndDateTimeChoiceSG1Cls();
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
            setName("DateAndDateTimeChoiceSG1");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
            setOriginalName("DateAndDateTimeChoice-SG1");
            setDatabaseColumnName("DateAndDateTimeChoice-SG1");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.DateAndDateTimeChoice.DateAndDateTimeChoiceSG1.class);
            setElementGroup(true);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Dt", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ISODateCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
            addElementDecl(element = new biz.c24.io.api.data.Element("DtTm", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ISODateTimeCls.class, iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
