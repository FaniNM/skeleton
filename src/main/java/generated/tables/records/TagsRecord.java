/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Tags;

import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagsRecord extends UpdatableRecordImpl<TagsRecord> implements Record3<Integer, Time, String> {

	private static final long serialVersionUID = -649999415;

	/**
	 * Setter for <code>public.tags.receiptid</code>.
	 */
	public void setReceiptid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tags.receiptid</code>.
	 */
	public Integer getReceiptid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.tags.uploaded</code>.
	 */
	public void setUploaded(Time value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tags.uploaded</code>.
	 */
	public Time getUploaded() {
		return (Time) getValue(1);
	}

	/**
	 * Setter for <code>public.tags.tag</code>.
	 */
	public void setTag(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.tags.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Time, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Time, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Tags.TAGS.RECEIPTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field2() {
		return Tags.TAGS.UPLOADED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Tags.TAGS.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getReceiptid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value2() {
		return getUploaded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value1(Integer value) {
		setReceiptid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value2(Time value) {
		setUploaded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value3(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord values(Integer value1, Time value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TagsRecord
	 */
	public TagsRecord() {
		super(Tags.TAGS);
	}

	/**
	 * Create a detached, initialised TagsRecord
	 */
	public TagsRecord(Integer receiptid, Time uploaded, String tag) {
		super(Tags.TAGS);

		setValue(0, receiptid);
		setValue(1, uploaded);
		setValue(2, tag);
	}


}