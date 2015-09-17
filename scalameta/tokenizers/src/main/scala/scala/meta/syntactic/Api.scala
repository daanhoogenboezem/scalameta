package scala.meta
package syntactic

import scala.meta.internal.tokenizers.ScalametaTokenizer

private[meta] trait ScalametaTokenizeApi {
  implicit def tokenize(implicit dialect: Dialect): Tokenize = {
    Tokenize(content => new ScalametaTokenizer(content).tokenize)
  }
}

object tokenizeApi extends GenericTokenizeApi with ScalametaTokenizeApi