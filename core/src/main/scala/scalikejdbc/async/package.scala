package scalikejdbc

import scalikejdbc._
import scala.concurrent.{ ExecutionContext, Future }
import scalikejdbc.async.ShortenedNames._
/**
 * Default package to import
 *
 * {{{
 *   import scalikejdbc._, async._
 * }}}
 */
package object async {

  // ---------------------
  // implicit conversions
  // ---------------------

  implicit def makeSQLExecutionAsync(sql: SQLExecution): AsyncSQLExecution = {
    new AsyncSQLExecutionImpl(sql)
  }

  implicit def makeSQLUpdateAsync(sql: SQLUpdate): AsyncSQLUpdate = {
    new AsyncSQLUpdateImpl(sql)
  }

  implicit def makeSQLUpdateAndReturnGeneratedKeyAsync(sql: SQLUpdateWithGeneratedKey): AsyncSQLUpdateAndReturnGeneratedKey = {
    new AsyncSQLUpdateAndReturnGeneratedKeyImpl(sql)
  }

  // --------------
  // one-to-x -> Option
  // --------------

  implicit def makeSQLToOptionAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToOption[A, HasExtractor]): AsyncSQLToOption[A] = {
    new AsyncSQLToOptionImpl[A](sql)
  }
  implicit def makeSQLToOptionAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToOptionImpl[A, HasExtractor]): AsyncSQLToOption[A] = {
    new AsyncSQLToOptionImpl[A](sql)
  }
  implicit def makeOneToOneSQLToOptionAsync[A, B, Z](sql: OneToOneSQLToOption[A, B, HasExtractor, Z]): AsyncOneToOneSQLToOption[A, B, Z] = {
    new AsyncOneToOneSQLToOption[A, B, Z](sql)
  }
  implicit def makeOneToManySQLToOptionAsync[A, B, Z](sql: OneToManySQLToOption[A, B, HasExtractor, Z]): AsyncOneToManySQLToOption[A, B, Z] = {
    new AsyncOneToManySQLToOption[A, B, Z](sql)
  }
  implicit def makeOneToManies2SQLToOptionAsync[A, B1, B2, Z](sql: OneToManies2SQLToOption[A, B1, B2, HasExtractor, Z]): AsyncOneToManies2SQLToOption[A, B1, B2, Z] = {
    new AsyncOneToManies2SQLToOption[A, B1, B2, Z](sql)
  }
  implicit def makeOneToManies3SQLToOptionAsync[A, B1, B2, B3, Z](sql: OneToManies3SQLToOption[A, B1, B2, B3, HasExtractor, Z]): AsyncOneToManies3SQLToOption[A, B1, B2, B3, Z] = {
    new AsyncOneToManies3SQLToOption[A, B1, B2, B3, Z](sql)
  }
  implicit def makeOneToManies4SQLToOptionAsync[A, B1, B2, B3, B4, Z](sql: OneToManies4SQLToOption[A, B1, B2, B3, B4, HasExtractor, Z]): AsyncOneToManies4SQLToOption[A, B1, B2, B3, B4, Z] = {
    new AsyncOneToManies4SQLToOption[A, B1, B2, B3, B4, Z](sql)
  }
  implicit def makeOneToManies5SQLToOptionAsync[A, B1, B2, B3, B4, B5, Z](sql: OneToManies5SQLToOption[A, B1, B2, B3, B4, B5, HasExtractor, Z]): AsyncOneToManies5SQLToOption[A, B1, B2, B3, B4, B5, Z] = {
    new AsyncOneToManies5SQLToOption[A, B1, B2, B3, B4, B5, Z](sql)
  }
  implicit def makeOneToManies6SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, Z](sql: OneToManies6SQLToOption[A, B1, B2, B3, B4, B5, B6, HasExtractor, Z]): AsyncOneToManies6SQLToOption[A, B1, B2, B3, B4, B5, B6, Z] = {
    new AsyncOneToManies6SQLToOption[A, B1, B2, B3, B4, B5, B6, Z](sql)
  }
  implicit def makeOneToManies7SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, Z](sql: OneToManies7SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, HasExtractor, Z]): AsyncOneToManies7SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, Z] = {
    new AsyncOneToManies7SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, Z](sql)
  }
  implicit def makeOneToManies8SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql: OneToManies8SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, HasExtractor, Z]): AsyncOneToManies8SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, Z] = {
    new AsyncOneToManies8SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql)
  }
  implicit def makeOneToManies9SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql: OneToManies9SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, HasExtractor, Z]): AsyncOneToManies9SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z] = {
    new AsyncOneToManies9SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql)
  }
  implicit def makeOneToManies10SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql: OneToManies10SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, HasExtractor, Z]): AsyncOneToManies10SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z] = {
    new AsyncOneToManies10SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql)
  }
  implicit def makeOneToManies11SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql: OneToManies11SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, HasExtractor, Z]): AsyncOneToManies11SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z] = {
    new AsyncOneToManies11SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql)
  }
  implicit def makeOneToManies12SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql: OneToManies12SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, HasExtractor, Z]): AsyncOneToManies12SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z] = {
    new AsyncOneToManies12SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql)
  }
  implicit def makeOneToManies13SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql: OneToManies13SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, HasExtractor, Z]): AsyncOneToManies13SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z] = {
    new AsyncOneToManies13SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql)
  }
  implicit def makeOneToManies14SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql: OneToManies14SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, HasExtractor, Z]): AsyncOneToManies14SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z] = {
    new AsyncOneToManies14SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql)
  }
  implicit def makeOneToManies15SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql: OneToManies15SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, HasExtractor, Z]): AsyncOneToManies15SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z] = {
    new AsyncOneToManies15SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql)
  }
  implicit def makeOneToManies16SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql: OneToManies16SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, HasExtractor, Z]): AsyncOneToManies16SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z] = {
    new AsyncOneToManies16SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql)
  }
  implicit def makeOneToManies17SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql: OneToManies17SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, HasExtractor, Z]): AsyncOneToManies17SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z] = {
    new AsyncOneToManies17SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql)
  }
  implicit def makeOneToManies18SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql: OneToManies18SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, HasExtractor, Z]): AsyncOneToManies18SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z] = {
    new AsyncOneToManies18SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql)
  }
  implicit def makeOneToManies19SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql: OneToManies19SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, HasExtractor, Z]): AsyncOneToManies19SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z] = {
    new AsyncOneToManies19SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql)
  }
  implicit def makeOneToManies20SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql: OneToManies20SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, HasExtractor, Z]): AsyncOneToManies20SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z] = {
    new AsyncOneToManies20SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql)
  }
  implicit def makeOneToManies21SQLToOptionAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql: OneToManies21SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, HasExtractor, Z]): AsyncOneToManies21SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z] = {
    new AsyncOneToManies21SQLToOption[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql)
  }

  // --------------
  // one-to-x -> Traversable
  // --------------

  implicit def makeSQLToTraversableAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToTraversable[A, HasExtractor]): AsyncSQLToTraversable[A] = {
    new AsyncSQLToTraversableImpl[A](sql)
  }
  implicit def makeSQLToTraversableAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToTraversableImpl[A, HasExtractor]): AsyncSQLToTraversable[A] = {
    new AsyncSQLToTraversableImpl[A](sql)
  }
  implicit def makeOneToOneSQLToTraversableAsync[A, B, Z](sql: OneToOneSQLToTraversable[A, B, HasExtractor, Z]): AsyncOneToOneSQLToTraversable[A, B, Z] = {
    new AsyncOneToOneSQLToTraversable[A, B, Z](sql)
  }
  implicit def makeOneToManySQLToTraversableAsync[A, B, Z](sql: OneToManySQLToTraversable[A, B, HasExtractor, Z]): AsyncOneToManySQLToTraversable[A, B, Z] = {
    new AsyncOneToManySQLToTraversable[A, B, Z](sql)
  }
  implicit def makeOneToManies2SQLToTraversableAsync[A, B1, B2, Z](sql: OneToManies2SQLToTraversable[A, B1, B2, HasExtractor, Z]): AsyncOneToManies2SQLToTraversable[A, B1, B2, Z] = {
    new AsyncOneToManies2SQLToTraversable[A, B1, B2, Z](sql)
  }
  implicit def makeOneToManies3SQLToTraversableAsync[A, B1, B2, B3, Z](sql: OneToManies3SQLToTraversable[A, B1, B2, B3, HasExtractor, Z]): AsyncOneToManies3SQLToTraversable[A, B1, B2, B3, Z] = {
    new AsyncOneToManies3SQLToTraversable[A, B1, B2, B3, Z](sql)
  }
  implicit def makeOneToManies4SQLToTraversableAsync[A, B1, B2, B3, B4, Z](sql: OneToManies4SQLToTraversable[A, B1, B2, B3, B4, HasExtractor, Z]): AsyncOneToManies4SQLToTraversable[A, B1, B2, B3, B4, Z] = {
    new AsyncOneToManies4SQLToTraversable[A, B1, B2, B3, B4, Z](sql)
  }
  implicit def makeOneToManies5SQLToTraversableAsync[A, B1, B2, B3, B4, B5, Z](sql: OneToManies5SQLToTraversable[A, B1, B2, B3, B4, B5, HasExtractor, Z]): AsyncOneToManies5SQLToTraversable[A, B1, B2, B3, B4, B5, Z] = {
    new AsyncOneToManies5SQLToTraversable[A, B1, B2, B3, B4, B5, Z](sql)
  }
  implicit def makeOneToManies6SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, Z](sql: OneToManies6SQLToTraversable[A, B1, B2, B3, B4, B5, B6, HasExtractor, Z]): AsyncOneToManies6SQLToTraversable[A, B1, B2, B3, B4, B5, B6, Z] = {
    new AsyncOneToManies6SQLToTraversable[A, B1, B2, B3, B4, B5, B6, Z](sql)
  }
  implicit def makeOneToManies7SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, Z](sql: OneToManies7SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, HasExtractor, Z]): AsyncOneToManies7SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, Z] = {
    new AsyncOneToManies7SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, Z](sql)
  }
  implicit def makeOneToManies8SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql: OneToManies8SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, HasExtractor, Z]): AsyncOneToManies8SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, Z] = {
    new AsyncOneToManies8SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql)
  }
  implicit def makeOneToManies9SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql: OneToManies9SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, HasExtractor, Z]): AsyncOneToManies9SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z] = {
    new AsyncOneToManies9SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql)
  }
  implicit def makeOneToManies10SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql: OneToManies10SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, HasExtractor, Z]): AsyncOneToManies10SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z] = {
    new AsyncOneToManies10SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql)
  }
  implicit def makeOneToManies11SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql: OneToManies11SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, HasExtractor, Z]): AsyncOneToManies11SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z] = {
    new AsyncOneToManies11SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql)
  }
  implicit def makeOneToManies12SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql: OneToManies12SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, HasExtractor, Z]): AsyncOneToManies12SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z] = {
    new AsyncOneToManies12SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql)
  }
  implicit def makeOneToManies13SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql: OneToManies13SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, HasExtractor, Z]): AsyncOneToManies13SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z] = {
    new AsyncOneToManies13SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql)
  }
  implicit def makeOneToManies14SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql: OneToManies14SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, HasExtractor, Z]): AsyncOneToManies14SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z] = {
    new AsyncOneToManies14SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql)
  }
  implicit def makeOneToManies15SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql: OneToManies15SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, HasExtractor, Z]): AsyncOneToManies15SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z] = {
    new AsyncOneToManies15SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql)
  }
  implicit def makeOneToManies16SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql: OneToManies16SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, HasExtractor, Z]): AsyncOneToManies16SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z] = {
    new AsyncOneToManies16SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql)
  }
  implicit def makeOneToManies17SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql: OneToManies17SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, HasExtractor, Z]): AsyncOneToManies17SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z] = {
    new AsyncOneToManies17SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql)
  }
  implicit def makeOneToManies18SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql: OneToManies18SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, HasExtractor, Z]): AsyncOneToManies18SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z] = {
    new AsyncOneToManies18SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql)
  }
  implicit def makeOneToManies19SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql: OneToManies19SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, HasExtractor, Z]): AsyncOneToManies19SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z] = {
    new AsyncOneToManies19SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql)
  }
  implicit def makeOneToManies20SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql: OneToManies20SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, HasExtractor, Z]): AsyncOneToManies20SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z] = {
    new AsyncOneToManies20SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql)
  }
  implicit def makeOneToManies21SQLToTraversableAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql: OneToManies21SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, HasExtractor, Z]): AsyncOneToManies21SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z] = {
    new AsyncOneToManies21SQLToTraversable[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql)
  }

  // --------------
  // one-to-x -> List
  // --------------

  implicit def makeSQLToListAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToList[A, HasExtractor]): AsyncSQLToList[A] = {
    new AsyncSQLToListImpl[A](sql)
  }
  implicit def makeSQLToListAsync[A, B1, B2, B3, B4, B5, Z](sql: SQLToListImpl[A, HasExtractor]): AsyncSQLToList[A] = {
    new AsyncSQLToListImpl[A](sql)
  }
  implicit def makeOneToOneSQLToListAsync[A, B, Z](sql: OneToOneSQLToList[A, B, HasExtractor, Z]): AsyncOneToOneSQLToList[A, B, Z] = {
    new AsyncOneToOneSQLToList[A, B, Z](sql)
  }
  implicit def makeOneToManySQLToListAsync[A, B, Z](sql: OneToManySQLToList[A, B, HasExtractor, Z]): AsyncOneToManySQLToList[A, B, Z] = {
    new AsyncOneToManySQLToList[A, B, Z](sql)
  }
  implicit def makeOneToManies2SQLToListAsync[A, B1, B2, Z](sql: OneToManies2SQLToList[A, B1, B2, HasExtractor, Z]): AsyncOneToManies2SQLToList[A, B1, B2, Z] = {
    new AsyncOneToManies2SQLToList[A, B1, B2, Z](sql)
  }
  implicit def makeOneToManies3SQLToListAsync[A, B1, B2, B3, Z](sql: OneToManies3SQLToList[A, B1, B2, B3, HasExtractor, Z]): AsyncOneToManies3SQLToList[A, B1, B2, B3, Z] = {
    new AsyncOneToManies3SQLToList[A, B1, B2, B3, Z](sql)
  }
  implicit def makeOneToManies4SQLToListAsync[A, B1, B2, B3, B4, Z](sql: OneToManies4SQLToList[A, B1, B2, B3, B4, HasExtractor, Z]): AsyncOneToManies4SQLToList[A, B1, B2, B3, B4, Z] = {
    new AsyncOneToManies4SQLToList[A, B1, B2, B3, B4, Z](sql)
  }
  implicit def makeOneToManies5SQLToListAsync[A, B1, B2, B3, B4, B5, Z](sql: OneToManies5SQLToList[A, B1, B2, B3, B4, B5, HasExtractor, Z]): AsyncOneToManies5SQLToList[A, B1, B2, B3, B4, B5, Z] = {
    new AsyncOneToManies5SQLToList[A, B1, B2, B3, B4, B5, Z](sql)
  }
  implicit def makeOneToManies6SQLToListAsync[A, B1, B2, B3, B4, B5, B6, Z](sql: OneToManies6SQLToList[A, B1, B2, B3, B4, B5, B6, HasExtractor, Z]): AsyncOneToManies6SQLToList[A, B1, B2, B3, B4, B5, B6, Z] = {
    new AsyncOneToManies6SQLToList[A, B1, B2, B3, B4, B5, B6, Z](sql)
  }
  implicit def makeOneToManies7SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, Z](sql: OneToManies7SQLToList[A, B1, B2, B3, B4, B5, B6, B7, HasExtractor, Z]): AsyncOneToManies7SQLToList[A, B1, B2, B3, B4, B5, B6, B7, Z] = {
    new AsyncOneToManies7SQLToList[A, B1, B2, B3, B4, B5, B6, B7, Z](sql)
  }
  implicit def makeOneToManies8SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql: OneToManies8SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, HasExtractor, Z]): AsyncOneToManies8SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, Z] = {
    new AsyncOneToManies8SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, Z](sql)
  }
  implicit def makeOneToManies9SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql: OneToManies9SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, HasExtractor, Z]): AsyncOneToManies9SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z] = {
    new AsyncOneToManies9SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, Z](sql)
  }
  implicit def makeOneToManies10SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql: OneToManies10SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, HasExtractor, Z]): AsyncOneToManies10SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z] = {
    new AsyncOneToManies10SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, Z](sql)
  }
  implicit def makeOneToManies11SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql: OneToManies11SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, HasExtractor, Z]): AsyncOneToManies11SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z] = {
    new AsyncOneToManies11SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, Z](sql)
  }
  implicit def makeOneToManies12SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql: OneToManies12SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, HasExtractor, Z]): AsyncOneToManies12SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z] = {
    new AsyncOneToManies12SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, Z](sql)
  }
  implicit def makeOneToManies13SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql: OneToManies13SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, HasExtractor, Z]): AsyncOneToManies13SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z] = {
    new AsyncOneToManies13SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, Z](sql)
  }
  implicit def makeOneToManies14SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql: OneToManies14SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, HasExtractor, Z]): AsyncOneToManies14SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z] = {
    new AsyncOneToManies14SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, Z](sql)
  }
  implicit def makeOneToManies15SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql: OneToManies15SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, HasExtractor, Z]): AsyncOneToManies15SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z] = {
    new AsyncOneToManies15SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, Z](sql)
  }
  implicit def makeOneToManies16SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql: OneToManies16SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, HasExtractor, Z]): AsyncOneToManies16SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z] = {
    new AsyncOneToManies16SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, Z](sql)
  }
  implicit def makeOneToManies17SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql: OneToManies17SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, HasExtractor, Z]): AsyncOneToManies17SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z] = {
    new AsyncOneToManies17SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, Z](sql)
  }
  implicit def makeOneToManies18SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql: OneToManies18SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, HasExtractor, Z]): AsyncOneToManies18SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z] = {
    new AsyncOneToManies18SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, Z](sql)
  }
  implicit def makeOneToManies19SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql: OneToManies19SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, HasExtractor, Z]): AsyncOneToManies19SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z] = {
    new AsyncOneToManies19SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, Z](sql)
  }
  implicit def makeOneToManies20SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql: OneToManies20SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, HasExtractor, Z]): AsyncOneToManies20SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z] = {
    new AsyncOneToManies20SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, Z](sql)
  }
  implicit def makeOneToManies21SQLToListAsync[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql: OneToManies21SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, HasExtractor, Z]): AsyncOneToManies21SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z] = {
    new AsyncOneToManies21SQLToList[A, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, Z](sql)
  }

  // ---------------------
  // utilities
  // ---------------------

  object updateFuture {
    def apply(sql: => SQLBuilder[_])(implicit session: AsyncDBSession, cxt: EC = ECGlobal): Future[Int] = {
      withSQL(sql).update.future
    }
  }

  object executeFuture {
    def apply(sql: => SQLBuilder[_])(implicit session: AsyncDBSession, cxt: EC = ECGlobal): Future[Boolean] = {
      withSQL(sql).execute.future
    }
  }

}
