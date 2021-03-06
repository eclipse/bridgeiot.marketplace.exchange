/**
 * Copyright (c) 2016-2017 in alphabetical order:
 * Atos IT Solutions and Services GmbH, National University of Ireland Galway, Siemens AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package exchange.repo

import exchange.ExchangeRepoSpec

trait EmptyExchangeRepoSpec extends ExchangeRepoSpec {

  def initRepos(repo: Seq[ExchangeRepoMutations]) = {}

  "EmptyExchangeRepo" should "not contain Organization" in { f =>
    f.queryRepo.organization(OrgId) shouldBe empty
  }

  it should "not contain Provider" in { f =>
    f.queryRepo.provider(ProvId) shouldBe empty
  }

  it should "not contain Offering" in { f =>
    f.queryRepo.offering(OffId) shouldBe empty
  }

}
