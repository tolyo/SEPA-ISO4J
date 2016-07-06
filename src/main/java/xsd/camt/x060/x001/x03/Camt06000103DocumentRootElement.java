/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03;

/**
 * Class Camt06000103DocumentRootElement.The Document Root element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Camt06000103DocumentRootElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile Camt06000103DocumentRootElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public Camt06000103DocumentRootElement() {
        this(true);
    }

    private Camt06000103DocumentRootElement(boolean init) {
        super("DocumentRoot", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRootElement.Camt06000103DocumentRootCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());

        if (init)
            init();
    }

    /**
     */
    public static biz.c24.io.api.data.Element getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRootElement(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     */
    private void init() {
        setDatabaseColumnName("Document Root");
        setIgnoredElement(false);
    }

    /**
     * Class Camt06000103DocumentRootCls.The Document Root complex
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
     * iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRoot
     */
    public static class Camt06000103DocumentRootCls extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRootElement.Camt06000103DocumentRootCls instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Camt06000103DocumentRootCls() {
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
                        instance = new iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRootElement.Camt06000103DocumentRootCls();
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
            setName("DocumentRoot");
            setModel(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance());
            setDatabaseColumnName("Document Root");
            setLocal(true);
            setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DocumentRoot.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Document", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.DocumentCls.class, iso.std.iso.x20022.tech.xsd.camt.x060.x001.x03.Camt06000103DataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
