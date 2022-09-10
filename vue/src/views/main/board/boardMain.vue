<template>
  <div class="page">
    <div class="board-title">
      <div>
        <div>
          <boardTitle :siteId="userInfo.userAddress"></boardTitle
          ><boardContent></boardContent>
        </div>
      </div>

      <div>
        <input
          class="search-text"
          type="text"
          placeholder="안녕하세요"
          maxlength="20"
        />
        <font-awesome-icon
          class="search-icon"
          icon="fa-solid fa-magnifying-glass"
          @click="iconHide"
        />
        <font-awesome-icon
          @click="deleteBox"
          class="x-icon"
          icon="fa-solid fa-xmark"
        />
        <button class="blue-btn" @click="boardWrite">글쓰기</button>
      </div>
    </div>
    <div class="board-content">
      <div>
        <div class="board-content-top">
          <div class="width-20">번호</div>
          <div class="width-30">제목</div>
          <div class="width-20">분류</div>
          <div class="width-50">내용</div>
          <div class="width-20">추천수</div>
          <div class="width-20">작성자</div>
          <div class="width-20">작성날짜</div>
        </div>
        <div class="board-content-center">
          <div class="row">
            <div class="width-20">1</div>
            <div class="width-30">test</div>
            <div class="width-20">바지</div>
            <div class="width-50">
              내용입니다내용입니다내용입니다내용입니다내용입니다내용입니다내용입니다내용입니다내용입니다
            </div>
            <div class="width-20">3</div>
            <div class="width-20">유동ㄹ현aasdasdasdasdklansoidnasoinio</div>
            <div class="width-20">20220804</div>
          </div>
          <div class="row">
            <div class="width-20">1</div>
            <div class="width-30">test</div>
            <div class="width-20">바지</div>
            <div class="width-50">내용입니다내용입니다내용입니다</div>
            <div class="width-20">3</div>
            <div class="width-20">유동ㄹ현</div>
            <div class="width-20">20220804</div>
          </div>
          <div class="row">
            <div class="width-20">1</div>
            <div class="width-30">test</div>
            <div class="width-20">바지</div>
            <div class="width-50">내용입니다내용입니다내용입니다</div>
            <div class="width-20">3</div>
            <div class="width-20">유동ㄹ현</div>
            <div class="width-20">20220804</div>
          </div>
          <div class="row">
            <div class="width-20">1</div>
            <div class="width-30">test</div>
            <div class="width-20">바지</div>
            <div class="width-50">내용입니다내용입니다내용입니다</div>
            <div class="width-20">3</div>
            <div class="width-20">유동ㄹ현</div>
            <div class="width-20">20220804</div>
          </div>
        </div>
      </div>
    </div>
    <div class="board-bottom">
      <div class="paging">
        <div class="paging-no">1</div>
        <div class="paging-no">2</div>
        <div class="paging-no">3</div>
        <div class="paging-no">4</div>
        <div class="paging-no">5</div>
      </div>
    </div>
  </div>
</template>

<script>
// eslint-disable-next-line
import _ from 'lodash'
import boardTitle from '../../../components/board/CMP_TEST_001.vue'
import boardContent from '../../../components/board/CMP_TEST_002.vue'
export default {
  data() {
    return {
      ddd: '아오',
    }
  },
  components: {
    boardTitle,
    boardContent,
  },
  computed: {
    userInfo() {
      return this.$store.getters.userInfo
    },
  },
  methods: {
    iconHide() {
      const sIcon = document.querySelector('.search-icon')
      const xIcon = document.querySelector('.x-icon')
      const textBox = document.querySelector('.search-text')

      sIcon.style.display = 'none'
      xIcon.style.display = 'inline-block'

      sIcon.style.animation = 'iconHide 0.5s forwards'
      textBox.style.display = 'inline-block'
      textBox.style.animation = 'textShow 0.5s forwards'
      textBox.focus()
    },
    deleteBox() {
      const sIcon = document.querySelector('.search-icon')
      const xIcon = document.querySelector('.x-icon')
      const textBox = document.querySelector('.search-text')
      xIcon.style.display = 'none'
      textBox.style.animation = 'textHive 0.5s forwards'
      sIcon.style.display = 'inline-block'
    },
    boardWrite() {
      //   const userInfo = this.$store.getters.userInfo
      //   console.log(userInfo)
      //   if (_.isEmpty(userInfo)) {
      //     alert('로그인 후 이용바람.')
      //   }
      this.$router.push({ name: 'boardWrite' })
    },
  },
}
</script>

<style></style>
