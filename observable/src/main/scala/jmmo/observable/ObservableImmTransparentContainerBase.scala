package jmmo.observable

import jmmo.observable.impl.{TransparentContainerGen, TransparentContainer}

/**
 * User: Tomas
 * Date: 01.09.13
 * Time: 18:06
 */
trait ObservableImmTransparentContainerBase[+A <: Observable] extends ObservableImmContainerBase[A] with TransparentContainerGen[A]
